package DAL;

import DAL.Cliente;
import DAL.Consulta;
import DAL.Funcionario;
import DAL.Linhavendamedicamento;
import DAL.Tipopagamento;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-15T18:20:39")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, BigDecimal> idvenda;
    public static volatile SingularAttribute<Venda, Tipopagamento> codtipopagamento;
    public static volatile SingularAttribute<Venda, BigInteger> estado;
    public static volatile SingularAttribute<Venda, Funcionario> idfuncionario;
    public static volatile ListAttribute<Venda, Consulta> consultaList;
    public static volatile SingularAttribute<Venda, BigInteger> desconto;
    public static volatile SingularAttribute<Venda, String> troco;
    public static volatile SingularAttribute<Venda, String> datavenda;
    public static volatile ListAttribute<Venda, Linhavendamedicamento> linhavendamedicamentoList;
    public static volatile SingularAttribute<Venda, String> totalvenda;
    public static volatile SingularAttribute<Venda, Cliente> idcliente;

}