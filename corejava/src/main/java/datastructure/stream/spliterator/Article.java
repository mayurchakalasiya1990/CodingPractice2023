package datastructure.stream.spliterator;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@RequiredArgsConstructor
@Setter
@Getter
public class Article {
        private List<Author> listOfAuthors;
        private int id;
        private String name;


// standard constructors/getters/setters
}