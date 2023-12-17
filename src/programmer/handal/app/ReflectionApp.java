package programmer.handal.app;

import programmer.handal.data.CreateUserRequest;
import programmer.handal.util.ValidationRuntime;
import programmer.handal.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("das");
        ValidationUtil.validationReflection(request);
    }
}
