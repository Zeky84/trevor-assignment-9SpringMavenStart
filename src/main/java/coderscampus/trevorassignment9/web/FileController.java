package coderscampus.trevorassignment9.web;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import coderscampus.trevorassignment9.domain.Recipe;
import coderscampus.trevorassignment9.service.FileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping("/gluten-free")
    public List<Recipe> glutenFree() throws IOException {
        List<Recipe> glutenFreeList = fileService.allRecipes().stream().
                filter(Recipe -> Recipe.getGlutenFree().equals(true)).collect(Collectors.toList());
        return glutenFreeList;
    }

    @GetMapping("/vegan")
    public List<Recipe> vegan() throws IOException {
        List<Recipe> veganList = fileService.allRecipes().stream().
                filter(Recipe -> Recipe.getVegan().equals(true)).collect(Collectors.toList());
        return veganList;
    }

    @GetMapping("/vegan-and-gluten-free")
    public List<Recipe> veganAndGlutenFree() throws IOException {
        List<Recipe> veganAndGlutenList = fileService.allRecipes().stream().
                filter(Recipe -> Recipe.getVegan().equals(true) && Recipe.getGlutenFree().equals(true))
                .collect(Collectors.toList());
        return veganAndGlutenList;
    }

    @GetMapping("/vegetarian")
    public List<Recipe> vegetarian() throws IOException {
        List<Recipe> veganList = fileService.allRecipes().stream().
                filter(Recipe -> Recipe.getVegan().equals(true)).collect(Collectors.toList());
        return veganList;
    }

    @GetMapping("/all-recipes")
    public List<Recipe> allRecipes() throws IOException {
        return fileService.allRecipes();
    }

}
