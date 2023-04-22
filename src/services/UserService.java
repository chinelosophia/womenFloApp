package services;

import data.model.User;
import data.repository.UserRepository;

public interface UserService {
    User registerUser();
    String calculateNextPeriod(User user);
    String calculateOvulation(User user);
}
