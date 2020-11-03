import com.intuit.karate.junit5.Karate;

class TestRunner {

    @Karate.Test
    Karate testSample() {
        return Karate.run("classpath:sample.feature");
    }
}
