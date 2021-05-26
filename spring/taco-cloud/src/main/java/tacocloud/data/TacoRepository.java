package tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import tacocloud.bean.Taco;

public interface TacoRepository extends CrudRepository<Taco,Long> {

}
