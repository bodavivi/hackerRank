package algorithm.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StrongPasswordTest {

  /*
  character numbers

  Other tests
  Decision Table:

   one digit  |   lowercase letter  | uppercase letter  | special character|
      ×       |          -          |         -         |         -        |    1
      -       |          ×          |         -         |         -        |    1
      -       |          -          |         ×         |         -        |    1
      -       |          -          |         -         |         ×        |    1

      ×       |          ×          |         -         |         -        |    2
      ×       |          -          |         ×         |         -        |    2
      ×       |          -          |         -         |         ×        |    2

      -       |          ×          |         ×         |         -        |    2
      -       |          ×          |         -         |         ×        |    2
      -       |          -          |         ×         |         ×        |    2
   */

  @Test
  void minimumNumber_should_return_1_if_password_is_5_character_long() {
    String password = "T3st#";
    Assertions.assertEquals(1, StrongPassword.minimumNumber(5, password));
  }

  @Test
  void minimumNumber_should_return_1_if_password_is_5_character_long_and_a_required_type_character_is_missing() {
    String password = "t3st#";
    Assertions.assertEquals(1, StrongPassword.minimumNumber(5, password));
  }

  @Test
  void minimumNumber_should_return_1_if_password_is_doesnt_have_a_digit() {
    String password = "Testy!";
    Assertions.assertEquals(1, StrongPassword.minimumNumber(6, password));
  }

  @Test
  void minimumNumber_should_return_1_if_password_is_doesnt_have_a_lowercase_letter() {
    String password = "T35TY@";
    Assertions.assertEquals(1, StrongPassword.minimumNumber(6, password));
  }

  @Test
  void minimumNumber_should_return_1_if_password_is_doesnt_have_an_uppercase_letter() {
    String password = "t35ty$";
    Assertions.assertEquals(1, StrongPassword.minimumNumber(6, password));
  }

  @Test
  void minimumNumber_should_return_1_if_password_is_doesnt_have_a_special_character() {
    String password = "T35tys";
    Assertions.assertEquals(1, StrongPassword.minimumNumber(6, password));
  }

  @Test
  void minimumNumber_should_return_2_if_password_is_doesnt_have_a_digit_and_a_lowercase_letter() {
    String password = "TESTYS%";
    Assertions.assertEquals(2, StrongPassword.minimumNumber(7, password));
  }

  @Test
  void minimumNumber_should_return_2_if_password_is_doesnt_have_a_digit_and_an_uppercase_letter() {
    String password = "testysys%";
    Assertions.assertEquals(2, StrongPassword.minimumNumber(9, password));
  }

  @Test
  void minimumNumber_should_return_2_if_password_is_doesnt_have_a_digit_and_a_special_character() {
    String password = "TeStYsYs";
    Assertions.assertEquals(2, StrongPassword.minimumNumber(8, password));
  }

  @Test
  void minimumNumber_should_return_2_if_password_is_doesnt_have_a_lowercase_letter_and_an_uppercase_letter() {
    String password = "123+()";
    Assertions.assertEquals(2, StrongPassword.minimumNumber(6, password));
  }

  @Test
  void minimumNumber_should_return_2_if_password_is_doesnt_have_a_lowercase_letter_and_a_special_character() {
    String password = "TEST123+()";
    Assertions.assertEquals(2, StrongPassword.minimumNumber(10, password));
  }

  @Test
  void minimumNumber_should_return_2_if_password_is_doesnt_have_an_uppercase_letter_and_a_special_character() {
    String password = "123testy";
    Assertions.assertEquals(2, StrongPassword.minimumNumber(9, password));
  }

  @Test
  void minimumNumber_should_return_0_if_password_meets_the_criteria(){
    String password = "Te5t-@";
    Assertions.assertEquals(0, StrongPassword.minimumNumber(6, password));
  }

  @Test
  void minimumNumber_should_return_4_if_password_has_6_characters_but_didnt_meet_the_other_criterias(){
    String password = "Łß¤öüóőúáé";
    Assertions.assertEquals(0, StrongPassword.minimumNumber(10, password));
  }
}