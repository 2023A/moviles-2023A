package com.corhuila.backendmovilsql.Controller;

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

import com.corhuila.backendmovilsql.Entity.TiposProductos;
import com.corhuila.backendmovilsql.IService.ITiposProductosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/tiposProductos")
public class TiposProductosController {

	@Autowired
	private ITiposProductosService service;
	
	@GetMapping
	public List<TiposProductos> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<TiposProductos> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public TiposProductos save(@RequestBody TiposProductos tiposProductos) {
		return service.save(tiposProductos);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	 public TiposProductos update(@PathVariable Long id, @RequestBody TiposProductos tiposProductos) {
        Optional<TiposProductos> op = service.findById(id);

        if (op.isPresent()) {
        	TiposProductos modulosUpdate = op.get();
            BeanUtils.copyProperties(tiposProductos, modulosUpdate, "id");
            return service.save(modulosUpdate);
        }

        return tiposProductos;
    }
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
