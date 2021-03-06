package convalida.validators;

import android.support.design.widget.TextInputLayout;
import android.widget.EditText;

/**
 * @author Wellington Costa on 27/06/2017.
 */
public class ConfirmPasswordValidator extends AbstractValidator {

    private EditText passwordEditText;
    private String password;

    ConfirmPasswordValidator(String password) {
        this.password = password;
    }

    public ConfirmPasswordValidator(TextInputLayout passwordLayout, TextInputLayout confirmPasswordLayout, String errorMessage) {
        super(confirmPasswordLayout, errorMessage);

        if (passwordLayout.getEditText() != null) {
            this.passwordEditText = passwordLayout.getEditText();
        }
    }

    public ConfirmPasswordValidator(EditText passwordEditText, EditText confirmPasswordEditText, String errorMessage) {
        super(confirmPasswordEditText, errorMessage);

        if (passwordEditText != null) {
            this.passwordEditText = passwordEditText;
        }
    }

    @Override
    boolean isNotValid(String value) {
        if (passwordEditText != null) {
            password = passwordEditText.getText().toString();
        }

        System.out.println("Password: " + password);
        System.out.println("Value: " + value);

        return !password.equals(value);
    }

}
