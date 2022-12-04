package DAL;

import DAL.Exame;
import DAL.Funcionario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-15T18:20:39")
@StaticMetamodel(Especialidadefuncionario.class)
public class Especialidadefuncionario_ { 

    public static volatile SingularAttribute<Especialidadefuncionario, BigDecimal> idespecialidade;
    public static volatile SingularAttribute<Especialidadefuncionario, Exame> exame;
    public static volatile ListAttribute<Especialidadefuncionario, Funcionario> funcionarioList;
    public static volatile SingularAttribute<Especialidadefuncionario, String> especialidade;
    public static volatile SingularAttribute<Especialidadefuncionario, Funcionario> funcionario;

}