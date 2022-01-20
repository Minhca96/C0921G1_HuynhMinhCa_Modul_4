package vn.codegym.validate_form_dang_ky.dto;

import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDto implements Validator {
    private Long id;
    @Size(message = "first ko dc nho hon 2 va loi hon 54 ky tu",min = 2,max = 54)
    private String firstName;
    @Size(message = "first ko dc nho hon 2 va loi hon 54 ky tu", min = 2,max = 54)
    private String lastName;
    @Pattern(message = "phone number phai bat dau tu 0 va co do dai 10 hoac 11 so",regexp="(^$|[0-9]{10})")
    private String phone;
  //  @Email(message = "Email is not valid", regexp="{(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])}")
    @NotEmpty(message = "Email cannot be empty")
    private String mail;

    public UserDto() {
    }

    public UserDto(Long id, @Size(message = "first ko dc nho hon 2 va loi hon 54 ky tu", min = 2, max = 54) String firstName, @Size(message = "first ko dc nho hon 2 va loi hon 54 ky tu", min = 2, max = 54) String lastName, @Pattern(message = "phone number phai bat dau tu 0 va co do dai 10 hoac 11 so", regexp = "(^$|[0-9]{10})") String phone, @NotEmpty(message = "Email cannot be empty") String mail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.mail = mail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        String REGEX_EMAIL = "^\\w+@\\w+[.]\\w+$";
        UserDto userDto = (UserDto) target;
        if (!userDto.mail.matches(REGEX_EMAIL)) {
        errors.rejectValue("mail","errors.email","mail ko hop le");
        }
    }
}
