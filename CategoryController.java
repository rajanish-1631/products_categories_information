package Category_Details;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CategoryController {
	
@Autowired
CategoryService categoryservice;


@RequestMapping(method=RequestMethod.GET,value="/category")
public List<Category> getCategories()
{
	return categoryservice.getCategory();
}

@RequestMapping(method=RequestMethod.GET, value="/category/{category_id}")
public Optional<Category> getCategory(@PathVariable String category_id)
{
   return categoryservice.getCategory(category_id);	
}

@RequestMapping(method=RequestMethod.POST, value="/category")
public ModelAndView addCategory(Category c1)
{
	return categoryservice.addCategory(c1);
}

@RequestMapping(method=RequestMethod.DELETE, value="/category/{category_id}")
public void deleteCategory(@PathVariable String category_id)
{
    categoryservice.deleteCategory(category_id);
}

@RequestMapping(method=RequestMethod.PUT, value="/category1/{category_id}")
public void updateCategory(@PathVariable String category_id, @RequestBody Category c)
{
	
	categoryservice.updateCategory(category_id,c);
}
}
