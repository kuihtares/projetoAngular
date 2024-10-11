# Usar a imagem oficial do Node.js como base
FROM node:20 AS build

# Definir o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copiar o arquivo package.json e package-lock.json para o diretório de trabalho
COPY clientes-app/package*.json ./

# Copiar todo o código do projeto para o diretório de trabalho
COPY clientes-app ./

# Instalar as dependências do projeto
RUN npm install

# Construir a aplicação Angular
RUN npm run build --prod

# Usar a imagem do Nginx para servir a aplicação Angular
FROM nginx:alpine

# Copiar os arquivos construídos para o diretório padrão do Nginx
COPY --from=build /app/dist/clientes-app /usr/share/nginx/html

# Expor a porta 80 para acessar a aplicação
EXPOSE 80

# Comando para iniciar o Nginx
CMD ["nginx", "-g", "daemon off;"]