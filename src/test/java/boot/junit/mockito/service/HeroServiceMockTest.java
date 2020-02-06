package boot.junit.mockito.service;

import boot.junit.mockito.domain.HeroRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class HeroServiceMockTest {

    @Mock
    HeroRepository heroRepository;

    @InjectMocks
    HeroService heroService = new HeroServiceImpl();

    @BeforeEach
    void setMockOutput() {
        when(heroRepository.get()).thenReturn("github.com/hong-il");
    }

    @DisplayName("Test Mock heroService + heroRepository")
    @Test
    void heroSaveRequestTest() {
        assertEquals("github.com/hong-il", heroService.get());
    }
}
