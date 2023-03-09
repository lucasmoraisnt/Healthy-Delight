# Healthy Delight

Uma API para o Sistema de controle de gastos

## Endpoints
- Diário 
    - Listar alimentos
    - Listar liquidos
   
- Perfil
    - Listar pessoa

- Adicionar
    - Cadastrar pessoa
    - Cadastrar alimento
    - Cadastrar liquidos

--- 

### Cadastrar pessoa
`POST `/projeto/api/pessoa

| campo | tipo | obrigatório | descriçãos
| --- | :---: | :---: | ---
| nome | text | sim | é nome da pessoa
| id_pessoa | long | sim | é o id do usuário que está utilizando o app
| peso | float | sim | é o peso do usuário, deve ser informado em kilogramas (kg)
| altura | float | sim | é a altura da pessoa, deve ser informada em centímetros (cm)
| imc | float | sim | é o índice de massa corporal da pessoa, será calculado pelo programa
| idade | int | sim | é a idade da pessoa
| sexo | texto | sim | é o sexo da pessoa

**Códigos de Respostas**
| código | descrição
| --- | ---
| 201 | pessoa cadastrada
| 400 | erro na validação de dados da requisição

### Cadastrar alimento
`POST `/projeto/api/alimento

| campo | tipo | obrigatório | descriçãos
| --- | :---: | :---: | ---
| alimento | text | sim | é o nome do alimento a ser cadastrado
| id_alimento | long | sim | é o id do alimento a ser cadastrado
| kcal | float | sim | é a quantidade de kcal que uma porção desse alimento possui
| porcao | int | sim | é a quantidade de gramas que uma porção desse alimento possui, deve ser informado em gramas (g)
| proteina | float | não | é a quantidade de proteinas que o alimento possui em uma porção, deve ser informado em gramas (g)
| gordura | float | não | é a quantidade de gordura que o alimento possui em uma porção, deve ser informado em gramas (g)
| carboidrato | float | não | é quantidade de carboidratos que o alimento possui em uma porção, deve ser informado em gramas (g)

**Códigos de Respostas**
| código | descrição
| --- | ---
| 201 | alimento cadastrado
| 400 | erro na validação de dados da requisição

### Cadastrar liquido
`POST `/projeto/api/liquido

| campo | tipo | obrigatório | descriçãos
| --- | :---: | :---: | ---
| liquido | text | sim | é o nome do liquido a ser cadastrado
| id_liquido | int | sim | é o id do liquido a ser cadastrado
| kcal | int | sim | é a quantidade de kcal que uma porção desse liquido possui
| porcao | int | sim | é a quantidade de ml que uma porção desse liquido possui, deve ser informado em mililitros (ml)
| proteina | int | não | é a quantidade de proteinas que o liquido possui em uma porção, deve ser informado em gramas (g)
| gordura | int | não | é a quantidade de gordura que o liquido possui em uma porção, deve ser informado em gramas (g)
| carboidrato | int | não | é quantidade de carboidratos que o liquido possui em uma porção, deve ser informado em gramas (g)


**Códigos de Respostas**
| código | descrição
| --- | ---
| 201 | liquido cadastrado
| 400 | erro na validação de dados da requisição


### Detalhar pessoa
`GET `/projeto/api/pessoa/{id_pessoa}
```
{
    "nome":"Luiz",
    "id_pessoa":"1",
    "peso":"100",
    "altura":"175"
    "imc":"37,2",
    "idade":"20",
    "sexo":"masculino"
}

**Códigos de Respostas**
| código | descrição
| --- | ---
| 200 | dados retornados no corpo da resposta
| 404 | não foi encontrado pessoa com id informado

### Detalhar alimento
`GET `/projeto/api/alimento/{id_alimento}
```
{
    "alimento":"pão",
    "id_alimento":"1",
    "kcal":"100",
    "porcao":"50",
    "proteina":"2",
    "gordura":"5",
    "carboidrato":"20"
}

**Códigos de Respostas**
| código | descrição
| --- | ---
| 200 | dados retornados no corpo da resposta
| 404 | não foi encontrado alimento com id informado

### Detalhar liquido
`GET `/projeto/api/alimento/{id_alimento}
```
{
    "liquido":"água",
    "id_liquido":"1",
    "kcal":"0",
    "porcao":"200",
    "proteina":"0",
    "gordura":"0",
    "carboidrato":"0"
}
```

**Códigos de Respostas**
| código | descrição
| --- | ---
| 200 | dados retornados no corpo da resposta
| 404 | não foi encontrado liquido com id informado
