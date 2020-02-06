package boot.junit.mockito.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
public class HeroServiceTest {

    @Autowired
    HeroService heroService = new HeroServiceImpl();

    @DisplayName("Test Spring @Autowired Integration")
    @Test
    void HeroSaveRequestTest() {
        //then
        assertThat("github.com/hong-il", is(heroService.get()));
    }
}
