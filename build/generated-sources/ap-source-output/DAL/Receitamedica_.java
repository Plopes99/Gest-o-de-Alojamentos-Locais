package DAL;

import DAL.Animal;
import DAL.Funcionario;
import DAL.Medicamento;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-15T18:20:39")
@StaticMetamodel(Receitamedica.class)
public class Receitamedica_ { 

    public static volatile SingularAttribute<Receitamedica, String> observacoes;
    public static volatile SingularAttribute<Receitamedica, Funcionario> idfuncionario;
    public static volatile SingularAttribute<Receitamedica, Animal> idanimal;
    public static volatile SingularAttribute<Receitamedica, Medicamento> idmedicamento;
    public static volatile SingularAttribute<Receitamedica, BigDecimal> idreceita;
    public static volatile SingularAttribute<Receitamedica, String> validade;

}