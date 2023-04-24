//package pizzaRest.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import pizzaRest.models.Cafe;
//import pizzaRest.models.Person;
//import pizzaRest.models.Pizza;
//import pizzaRest.repositiries.PersonRepository;
//import pizzaRest.repositiries.PizzaRepository;
//import pizzaRest.services.PersonService;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
///**
// * @author Sergii Bugaienko
// */
//
//@Configuration
//@Import(CommonConfig.class)
//public class TestBeansContextConfig {
//
//    @Bean
//    public PersonRepository personRepository(){
//        return new PersonRepository() {
//            @Override
//            public Optional<Person> findByUsername(String username) {
//                return Optional.empty();
//            }
//
//            @Override
//            public Optional<Person> findByEmail(String email) {
//                return Optional.empty();
//            }
//
//            @Override
//            public List<Person> findAll() {
//                return null;
//            }
//
//            @Override
//            public List<Person> findAll(Sort sort) {
//                return null;
//            }
//
//            @Override
//            public List<Person> findAllById(Iterable<Integer> integers) {
//                return null;
//            }
//
//            @Override
//            public <S extends Person> List<S> saveAll(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public void flush() {
//
//            }
//
//            @Override
//            public <S extends Person> S saveAndFlush(S entity) {
//                return null;
//            }
//
//            @Override
//            public <S extends Person> List<S> saveAllAndFlush(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public void deleteAllInBatch(Iterable<Person> entities) {
//
//            }
//
//            @Override
//            public void deleteAllByIdInBatch(Iterable<Integer> integers) {
//
//            }
//
//            @Override
//            public void deleteAllInBatch() {
//
//            }
//
//            @Override
//            public Person getOne(Integer integer) {
//                return null;
//            }
//
//            @Override
//            public Person getById(Integer integer) {
//                return null;
//            }
//
//            @Override
//            public Person getReferenceById(Integer integer) {
//                return null;
//            }
//
//            @Override
//            public <S extends Person> List<S> findAll(Example<S> example) {
//                return null;
//            }
//
//            @Override
//            public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
//                return null;
//            }
//
//            @Override
//            public Page<Person> findAll(Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends Person> S save(S entity) {
//                return null;
//            }
//
//            @Override
//            public Optional<Person> findById(Integer integer) {
//                return Optional.empty();
//            }
//
//            @Override
//            public boolean existsById(Integer integer) {
//                return false;
//            }
//
//            @Override
//            public long count() {
//                return 0;
//            }
//
//            @Override
//            public void deleteById(Integer integer) {
//
//            }
//
//            @Override
//            public void delete(Person entity) {
//
//            }
//
//            @Override
//            public void deleteAllById(Iterable<? extends Integer> integers) {
//
//            }
//
//            @Override
//            public void deleteAll(Iterable<? extends Person> entities) {
//
//            }
//
//            @Override
//            public void deleteAll() {
//
//            }
//
//            @Override
//            public <S extends Person> Optional<S> findOne(Example<S> example) {
//                return Optional.empty();
//            }
//
//            @Override
//            public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends Person> long count(Example<S> example) {
//                return 0;
//            }
//
//            @Override
//            public <S extends Person> boolean exists(Example<S> example) {
//                return false;
//            }
//
//            @Override
//            public <S extends Person, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//                return null;
//            }
//        };
//    }
//    @Bean
//    public PizzaRepository pizzaRepository(){
//        return new PizzaRepository() {
//            @Override
//            public List<Pizza> findDistinctPizzaByBase_SizeLikeIgnoreCase(String size, Sort name) {
//                return null;
//            }
//
//            @Override
//            public List<Pizza> findByPersons(Person person) {
//                return null;
//            }
//
//            @Override
//            public List<Pizza> findByCafes(Cafe cafe, Sort sort) {
//                return null;
//            }
//
//            @Override
//            public Optional<Pizza> findByName(String name) {
//                return Optional.empty();
//            }
//
//            @Override
//            public List<Pizza> findAll() {
//                return null;
//            }
//
//            @Override
//            public List<Pizza> findAll(Sort sort) {
//                return null;
//            }
//
//            @Override
//            public List<Pizza> findAllById(Iterable<Integer> integers) {
//                return null;
//            }
//
//            @Override
//            public <S extends Pizza> List<S> saveAll(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public void flush() {
//
//            }
//
//            @Override
//            public <S extends Pizza> S saveAndFlush(S entity) {
//                return null;
//            }
//
//            @Override
//            public <S extends Pizza> List<S> saveAllAndFlush(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public void deleteAllInBatch(Iterable<Pizza> entities) {
//
//            }
//
//            @Override
//            public void deleteAllByIdInBatch(Iterable<Integer> integers) {
//
//            }
//
//            @Override
//            public void deleteAllInBatch() {
//
//            }
//
//            @Override
//            public Pizza getOne(Integer integer) {
//                return null;
//            }
//
//            @Override
//            public Pizza getById(Integer integer) {
//                return null;
//            }
//
//            @Override
//            public Pizza getReferenceById(Integer integer) {
//                return null;
//            }
//
//            @Override
//            public <S extends Pizza> List<S> findAll(Example<S> example) {
//                return null;
//            }
//
//            @Override
//            public <S extends Pizza> List<S> findAll(Example<S> example, Sort sort) {
//                return null;
//            }
//
//            @Override
//            public Page<Pizza> findAll(Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends Pizza> S save(S entity) {
//                return null;
//            }
//
//            @Override
//            public Optional<Pizza> findById(Integer integer) {
//                return Optional.empty();
//            }
//
//            @Override
//            public boolean existsById(Integer integer) {
//                return false;
//            }
//
//            @Override
//            public long count() {
//                return 0;
//            }
//
//            @Override
//            public void deleteById(Integer integer) {
//
//            }
//
//            @Override
//            public void delete(Pizza entity) {
//
//            }
//
//            @Override
//            public void deleteAllById(Iterable<? extends Integer> integers) {
//
//            }
//
//            @Override
//            public void deleteAll(Iterable<? extends Pizza> entities) {
//
//            }
//
//            @Override
//            public void deleteAll() {
//
//            }
//
//            @Override
//            public <S extends Pizza> Optional<S> findOne(Example<S> example) {
//                return Optional.empty();
//            }
//
//            @Override
//            public <S extends Pizza> Page<S> findAll(Example<S> example, Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends Pizza> long count(Example<S> example) {
//                return 0;
//            }
//
//            @Override
//            public <S extends Pizza> boolean exists(Example<S> example) {
//                return false;
//            }
//
//            @Override
//            public <S extends Pizza, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//                return null;
//            }
//        };
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new PasswordEncoder() {
//            @Override
//            public String encode(CharSequence rawPassword) {
//                return null;
//            }
//
//            @Override
//            public boolean matches(CharSequence rawPassword, String encodedPassword) {
//                return false;
//            }
//        };
//    }
//
//    @Bean
//    public PersonService personService(){
//        return new PersonService(personRepository(), pizzaRepository(),passwordEncoder());
//    }
//}
