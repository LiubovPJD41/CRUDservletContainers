package Polyaeva;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Polyaeva.controller.PostController;
import Polyaeva.repository.PostRepository;
import Polyaeva.service.PostService;

@Configuration
public class JavaConfig {
    @Bean
    public PostController postController(PostService service) {
        return new PostController(service);
    }

    @Bean
    public PostService postService(PostRepository repository) {
        return new PostService(repository);
    }

    @Bean
    public PostRepository postRepository() {
        return new PostRepository();
    }
}
