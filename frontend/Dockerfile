FROM node:18
WORKDIR /app
COPY package*.json ./
RUN npm install -g @angular/cli && npm install
COPY . .
CMD ["npm", "run", "dev"]
# CMD ["ng", "serve", "--host", "0.0.0.0"]
