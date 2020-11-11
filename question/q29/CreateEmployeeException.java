package question.q29;

import java.util.ArrayList;
import java.util.List;

class CreateEmployeeException extends RuntimeException {
    private String id;
    private List<String> errorList = new ArrayList<>();

    public CreateEmployeeException(String id) {
        this.id = id;
    }

    public CreateEmployeeException(String message, String id) {
        super(message);
        this.id = id;
    }

    public CreateEmployeeException(Throwable cause, String id) {
        super(cause);
        this.id = id;
    }

    public CreateEmployeeException(String message, Throwable cause, String id) {
        super(message, cause);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getErrorList() {
        return id + "," + String.join(",",errorList);
    }

    public void addErrorList(String error) {
        errorList.add(error);
    }
}
