package DAL;

import DAL.Especialidadefuncionario;
import DAL.Tipofuncionario;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-15T18:20:39")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, Especialidadefuncionario> idespecialidade;
    public static volatile SingularAttribute<Funcionario, BigInteger> numregisto;
    public static volatile SingularAttribute<Funcionario, BigDecimal> idfuncionario;
    public static volatile SingularAttribute<Funcionario, String> password;
    public static volatile SingularAttribute<Funcionario, String> contacto;
    public static volatile SingularAttribute<Funcionario, Tipofuncionario> codtipofuncionario;
    public static volatile SingularAttribute<Funcionario, Especialidadefuncionario> especialidadefuncionario;
    public static volatile SingularAttribute<Funcionario, String> niss;
    public static volatile SingularAttribute<Funcionario, String> nome;
    public static volatile SingularAttribute<Funcionario, String> email;

}