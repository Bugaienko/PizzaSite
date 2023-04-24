package pizzaRest.config;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringJUnitConfig
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestTemplateDemo {

    @Autowired
    @RegisterExtension
    TestTemplateInvocationContextProvider testTemplateInvocationContextProvider;

    @TestTemplate
    void testTemplate(String parameter) {
        assertTrue("foo".equals(parameter) || "bar".equals(parameter));
    }

    @Configuration
    static class Config {

        @Bean
        String foo() {
            return "foo";
        }

        @Bean
        String bar() {
            return "bar";
        }

        // @Bean
        String baz() {
            return "baz";
        }



        @Bean
        TestTemplateInvocationContextProvider myTestTemplateInvocationContextProvider(
                List<String> parameters) {

            return new MyTestTemplateInvocationContextProvider(parameters);
        }
    }

    public static class MyTestTemplateInvocationContextProvider
            implements TestTemplateInvocationContextProvider {

        private final List<String> parameters;

        public MyTestTemplateInvocationContextProvider(List<String> parameters) {
            this.parameters = parameters;
        }

        @Override
        public boolean supportsTestTemplate(ExtensionContext context) {
            return true;
        }

        @Override
        public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(
                ExtensionContext context) {

            return this.parameters.stream().map(p -> invocationContext(p));
        }

        private TestTemplateInvocationContext invocationContext(String parameter) {
            return new TestTemplateInvocationContext() {

                @Override
                public String getDisplayName(int invocationIndex) {
                    return parameter;
                }

                @Override
                public List<Extension> getAdditionalExtensions() {
                    return Collections.singletonList(new ParameterResolver() {

                        @Override
                        public boolean supportsParameter(
                                ParameterContext parameterContext,
                                ExtensionContext extensionContext) {
                            return parameterContext.getParameter().getType().equals(
                                    String.class);
                        }

                        @Override
                        public Object resolveParameter(ParameterContext parameterContext,
                                                       ExtensionContext extensionContext) {
                            return parameter;
                        }
                    });
                }
            };
        }
    }

}