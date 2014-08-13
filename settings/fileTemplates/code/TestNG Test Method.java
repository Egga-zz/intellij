@org.testng.annotations.Test
public void should${NAME}() {
  ${BODY}
  
  org.hamcrest.MatcherAssert.assertThat(1, org.hamcrest.Matchers.equalTo(1));
}