import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiDeleteUserTest {

    public static String BASE_URL = "https://studio-api.softr.io/v1";

    public static String softrApiKey = "khIbAyJIU5CIuh1oDuBRx1s49";

    public static String softrDomain = "jere237.softr.app";

    public static String contentType = "application/json";


    public static String emailTeacherFurDelete = "aleksShow2121@gmail.com";

    public static String emailStudentFurDelete = "aleksFill2121@gmail.com";
    //@Test
    public void deleteUserTeacher(){
        given()
                .baseUri(BASE_URL)
                .header("Softr-Api-Key", softrApiKey)
                .header("Softr-Domain", softrDomain)
                .header("Content-Type", contentType)
                .when().log().all()
                .delete("/api/users"+emailTeacherFurDelete)
                .then().log().all()
                .statusCode(200);
    }
   // @Test
    public void deleteUserStudent(){
        given()
                .baseUri(BASE_URL)
                .header("Softr-Api-Key", softrApiKey)
                .header("Softr-Domain", softrDomain)
                .header("Content-Type", contentType)
                .when().log().all()
                .delete("/api/users"+emailStudentFurDelete)
                .then().log().all()
                .extract();
    }
}
