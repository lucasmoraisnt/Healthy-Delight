# Projeto

Uma API para o Sistema de controle de gastos

## Endpoints
- Despesas 
    - [Cadastrar](#cadastrar-despesas)
    - LIstar todas
    - Apagar
    - Alterar 
    - [Mostrar detalhes](#detalhar-despesas)
- Contas
    - Cadastrar
    - Listar todas
    - Apagar
    - Alterar
    - Mostrar detalhes
- Categorias

--- 

### Cadastrar despesas
`POST `/projeto/api/despesa

| campo | tipo | obrigatório | descrição
| --- | :---: | :---: | ---
| valor | decimal | sim | é o valor da despessa. deve ser maior que zero
| categoria_id | int | sim | é o id de uma categoria previamente cadastrada
| conta_id | int | sim | é o id de uma conta previamente cadastrada
| data | data | sim | é a data da despesa
| descrição | texto | não | uma descrição da despesa com no máximo 255 caracteres

**Exemplo do corpo do request**

```
{
    "valor": 100.00,
    "categoria_id": 1,
    "conta_id": 1,
    "data": "2023-01-27",
    "descricao": "cinema com os amigos"
}
```

**Códigos de Respostas**
| código | descrição
| --- | ---
| 201 | despesa cadastrada
| 400 | erro na validação de dados da requisição

---

### Detalhar despesas
`GET `/projeto/api/despesa/{id}
```
{
    "valor": 100.00,
    "categoria":{
        "categoria_id": 1,
        "nm_categoria": "lazer"
    },
    "conta":{
        "conta_id": 1,
        "nm_conta": "itaú"
    },
    "data": "2023-01-27",
    "descricao": "cinema com os amigos"
}
```

**Códigos de Respostas**
| código | descrição
| --- | ---
| 200 | dados retornados no corpo da resposta
| 404 | não foi encontrado despesa com id informado