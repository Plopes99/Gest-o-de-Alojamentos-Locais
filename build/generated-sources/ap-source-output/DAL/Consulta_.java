package DAL;

import DAL.Animal;
import DAL.Funcionario;
import DAL.Venda;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-15T18:20:39")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, Venda> idvenda;
    public static volatile SingularAttribute<Consulta, String> observacoes;
    public static volatile SingularAttribute<Consulta, String> estado;
    public static volatile SingularAttribute<Consulta, Funcionario> idfuncionario;
    public static volatile SingularAttribute<Consulta, BigDecimal> idconsulta;
    public static volatile SingularAttribute<Consulta, String> precobase;
    public static volatile SingularAttribute<Consulta, String> datahoraconsulta;
    public static volatile SingularAttribute<Consulta, String> ivaconsulta;
    public static volatile SingularAttribute<Consulta, Animal> idanimal;

}