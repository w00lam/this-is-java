package ch11.quiz.Q7;

public class NoExistIdException extends Exception {
    public NoExistIdException() {
    }

    public NoExistIdException(String message) {
        super(message);
    }
}
