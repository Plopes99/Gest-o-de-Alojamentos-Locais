package DAL;

import DAL.Animal;
import DAL.Especialidadefuncionario;
import DAL.Venda;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-15T18:20:39")
@StaticMetamodel(Exame.class)
public class Exame_ { 

    public static volatile SingularAttribute<Exame, Venda> idvenda;
    public static volatile SingularAttribute<Exame, BigDecimal> idexame;
    public static volatile SingularAttribute<Exame, String> estado;
    public static volatile SingularAttribute<Exame, String> idfuncionario;
    public static volatile SingularAttribute<Exame, String> data;
    public static volatile SingularAttribute<Exame, String> descricaoexame;
    public static volatile SingularAttribute<Exame, Animal> idanimal;
    public static volatile SingularAttribute<Exame, Especialidadefuncionario> especialidadefuncionario;
    public static volatile SingularAttribute<Exame, String> precoexame;

}