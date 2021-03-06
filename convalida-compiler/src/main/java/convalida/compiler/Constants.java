package convalida.compiler;

import com.squareup.javapoet.ClassName;

/**
 * @author Wellington Costa on 26/10/2017.
 */
class Constants {

    static final ClassName UI_THREAD                    = ClassName.get("android.support.annotation", "UiThread");
    static final ClassName OVERRIDE                     = ClassName.get("java.lang", "Override");

    static final ClassName VALIDATOR                    = ClassName.get("convalida.library", "ConvalidaValidator");
    static final ClassName VALIDATION_SET               = ClassName.get("convalida.library", "ValidationSet");

    static final String NOT_EMPTY_ANNOTATION            = "convalida.annotations.NotEmptyValidation";
    static final String EMAIL_ANNOTATION                = "convalida.annotations.EmailValidation";
    static final String PATTERN_ANNOTATION              = "convalida.annotations.PatternValidation";
    static final String LENGTH_ANNOTATION               = "convalida.annotations.LengthValidation";
    static final String ONLY_NUMBER_ANNOTATION          = "convalida.annotations.OnlyNumberValidation";
    static final String PASSWORD_ANNOTATION             = "convalida.annotations.PasswordValidation";
    static final String CONFIRM_PASSWORD_ANNOTATION     = "convalida.annotations.ConfirmPasswordValidation";

    private static final String VALIDATORS_PACKAGE      = "convalida.validators";

    static final ClassName NOT_EMPTY_VALIDATOR          = ClassName.get(VALIDATORS_PACKAGE, "NotEmptyValidator");
    static final ClassName EMAIL_VALIDATOR              = ClassName.get(VALIDATORS_PACKAGE, "EmailValidator");
    static final ClassName PATTERN_VALIDATOR            = ClassName.get(VALIDATORS_PACKAGE, "PatternValidator");
    static final ClassName LENGTH_VALIDATOR             = ClassName.get(VALIDATORS_PACKAGE, "LengthValidator");
    static final ClassName ONLY_NUMBER_VALIDATOR        = ClassName.get(VALIDATORS_PACKAGE, "OnlyNumberValidator");
    static final ClassName PASSWORD_VALIDATOR           = ClassName.get(VALIDATORS_PACKAGE, "PasswordValidator");
    static final ClassName CONFIRM_PASSWORD_VALIDATOR   = ClassName.get(VALIDATORS_PACKAGE, "ConfirmPasswordValidator");

}