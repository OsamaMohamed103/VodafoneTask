package RestAssured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class API_GETALLPOSTS {

    @Test
    public void test0(){
        //Testing 1 APIS  FROM THE COLLECTION NAME = 'GET ALL POSTS' .
        RestAssured.given().baseUri("https://jsonplaceholder.typicode.com/").
                when().
                get("posts")
                .then().
                log().all()
                .assertThat().statusCode(200)
                .assertThat().body("[1].title",equalTo("qui est esse"))
                .assertThat().body("title",hasItem("dolorem dolore est ipsam"));
    }
}
