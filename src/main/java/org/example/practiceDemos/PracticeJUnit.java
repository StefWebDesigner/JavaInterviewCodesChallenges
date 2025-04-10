//package org.example.practiceDemos;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.Optional;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class UserServiceTest {
//    @Mock
//    private UserRepository userRepository;
//
//    @InjectMocks
//    private UserService userService;
//
//    @Test
//    public void name() {
//    }
//
//    @Test
//    public void getUserByIdTest() {
//
//        User testUser = new User(
//                3,
//                "john@gmail.com",
//                "password1",
//                "john",
//                "USER"
//        );
//
//        when(userRepository.findById(testUser.getId())).thenReturn(Optional.of(testUser));
//        assertEquals(testUser, userService.findUserById(testUser.getId()));
//    }
//
//    @Test
//    public void TestGetUserByName() {
//        User user = new User();
//        user.setId(1);
//        user.setName("ClientName");
//
//        when(userRepository.findById()).thenReturn(Optional.of(user));
//        User result = userService.getUserId(1);
//
//        ass
//    }
//
//    @Test
//    public void deleteUserTest() {
//        User expectedUser = new User(1, "john@gmail.com", "password1", "john", "USER");
//
//
//        when(userRepository.findById(1)).thenReturn(Optional.of(expectedUser));
//
//        assertEquals(userService.deleteUser(1), "user deleted successfully");
//    }
//
//    @Test
//    public void createProductsTest(){
//        Products testProd = new Products(
//                1,
//                "iphone",
//                "",
//                "some description",
//                1000.0,
//                "Electronics",
//                10
//        );
//
//        when(productRepository.save(testProd)).thenReturn(testProd);
//        assertEquals(testProd, productService.createProducts(testProd));
//    }
//
//    public void getAllProductsTest(){
//        when(productRepository.findAll()).thenReturn(Stream
//                .of(new Products(),
//                        new Products(),
//                        new Products()
//                ).collect(Collectors.toList())
//        );
//        assertEquals(3, productService.getAllProducts().size());
//    }
//
//    @Test
//    public void example(){
//        when(userRepository.finalAll()).thenReturn(Stream.of(new Products(),
//                new Prodocts(),
//                )).collect(Collectors.toList());
//
//        assertEquals(2, productService.getAllProducts().size());
//    }
//}
//
//
//
