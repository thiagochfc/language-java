package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {
    
    private static final long serivalVersionUID = 1l;
    
    private Map<String, String> errors = new HashMap<>();
    
    public ValidationException(String msg) {
        super(msg);
    }
    
    public Map<String, String> getErrors() {
        return this.errors;
    }
    
    public void addError(String fieldName, String errorMessage) {
        this.errors.put(fieldName, errorMessage);
    }
}
