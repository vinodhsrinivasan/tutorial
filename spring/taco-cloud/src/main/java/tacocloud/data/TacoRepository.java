package tacocloud.data;

import tacocloud.bean.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}
