package com.corhuila.backendmovilnosql.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.backendmovilnosql.Collection.Productos;
import com.corhuila.backendmovilnosql.IService.IProductosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/productos")
public class ProductosController {

	@Autowired
	private IProductosService service;
	
	@GetMapping
	public List<Productos> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Productos> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Productos save(@RequestBody Productos productos) {
		return service.save(productos);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	 public Productos update(@PathVariable String id, @RequestBody Productos productos) {
        Optional<Productos> op = service.findById(id);

        if (op.isPresent()) {
        	Productos modulosUpdate = op.get();
            BeanUtils.copyProperties(productos, modulosUpdate, "id");
            return service.save(modulosUpdate);
        }

        return productos;
    }
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
