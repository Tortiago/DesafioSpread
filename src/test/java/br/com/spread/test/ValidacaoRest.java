package br.com.spread.test;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
import org.junit.Test;

import cucumber.api.java.en.Given;

public class ValidacaoRest {

	@Test
	public void valida() {
		given()
		.when()
			.get(uri)
	}
}
