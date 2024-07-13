# Url Shortener (Backend-br) - Java
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

## 🔗 Link de download
https://github.com/Ital023/UrlShortener-Backend-br/archive/refs/heads/master.zip

## :rocket: Sobre o desafio

**Desafio: Encurtador de URLs**

**Objetivo:** Implementar um serviço que transforma URLs longas em URLs compactas e fáceis de compartilhar.

**Exemplo de Uso:**
- **Chamada de Encurtamento:**
  - **Endpoint:** `[POST] /shorten-url`
  - **Entrada:** `{"url": "https://backendbrasil.com.br"}`
  - **Saída:** `{"url": "https://xxx.com/DXB6V"}`

**Requisitos:**
1. **Entrada:** Recebe uma URL longa.
2. **Encurtamento:** 
   - Tamanho: 5 a 10 caracteres.
   - Composição: Letras e números.
3. **Armazenamento:** A URL encurtada e a URL original são salvas no banco de dados com um prazo de validade.
4. **Redirecionamento:** 
   - Recebe a URL encurtada (`https://xxx.com/DXB6V`).
   - Redireciona para a URL original.
   - Retorna HTTP 404 se a URL não for encontrada.

## :white_check_mark: Funcionalidades
| Método | Caminho                      | Response                                           |
| ------ | -------------------------- | -------------------------------------------------- |
| GET    | http://localhost:8080/v1/users | Redireciona para a pagina do link encurtado   |
| POST    | http://localhost:8080/shorten-url | Gera um link encurtado e registra-o no banco de dados |







## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/Ital023" title="Github do Ítalo Miranda">
        <img src="https://avatars.githubusercontent.com/u/113559117?v=4" width="100px;" alt="Foto do Ítalo Miranda no GitHub"/><br>
        <sub>
          <b>Ítalo Miranda</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
