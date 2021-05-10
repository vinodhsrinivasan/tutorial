package tacocloud.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import tacocloud.bean.Ingredient;
import tacocloud.bean.Taco;

import java.util.Date;

public class JdbcTacoRepository implements TacoRepository{

    private JdbcTemplate jdbc;

    @Autowired
    public JdbcTacoRepository(JdbcTemplate jdbc){
        this.jdbc=jdbc;
    }

    @Override
    public Taco save(Taco taco) {
        long tacoId=saveTacoInfo(taco);
        taco.setId(tacoId);
        for (Ingredient ingredient : taco.getIngredients())
              {
            saveIngredientToTaco(ingredient,tacoId);
        }
        return taco;
    }

    private long saveTacoInfo(Taco taco) {
        taco.setCreatedAt(new Date());
        return 0;
    }

    private void saveIngredientToTaco(Ingredient ingredient, long tacoId) {

    }


}
