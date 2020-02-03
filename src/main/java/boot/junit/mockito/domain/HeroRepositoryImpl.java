package boot.junit.mockito.domain;

import org.springframework.stereotype.Repository;

@Repository
public class HeroRepositoryImpl implements HeroRepository {

    @Override
    public String get() {
        return "github.com/hong-il";
    }
}
