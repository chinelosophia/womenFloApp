import data.model.User;
import data.repository.UserRepository;
import data.repository.UserRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class UserRepositoryImplTest {
        User user;
        UserRepository userRepository;



        @BeforeEach
        void setUp(){
            user = new User();
            user.setFirstName("chinelo");
            user.setLastName("okpala");
            user.setPassWord("password");
            user.setFirstPeriodDay(2);
            user.setNumberOfDays(3);
          // user.setMenstrualCycleRange(26-27);
            userRepository= new UserRepositoryImpl();
        }

        @Test
        public void findSaveUser(){
            User SavedUser = userRepository.saveUser(user);
            assertEquals(1,userRepository.count());

        }


    }

