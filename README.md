# Travel Planner AI Agent

This is an application developed on the Next Level Week 16 event.
It is a Travel Planner API utilized to manage the trips and participants.

## About the Tech Used

Application of the following concepts:

- Spring Boot
- Spring Boot DevTools
- Spring Web
- Spring Data JPA
- Flyway Migration (similar as Liquibase)
- Lombok
- H2 Database

## Configuring develop environment (for a Mac)

1) Set openai apikey environment variable

nano ~/.zshrc
export OPENAI_API_KEY='your-api-key'


2) Install rye to manage python and project dependencies

curl -sSf https://rye.astral.sh/get | bash

3) Install dependencies for the project (also found on requirements.txt)

rye add langchain
rye add langchain-openai
rye add langchain-community
rya add langchainhub
rye add duckduckgo-search
rye add wikipedia
rye add chromadb

4) After adding a new dependency, execute 'sync' to update the virtual environment
rye sync

5) Execute examples

python travelAgent.py

## Configuring AWS to deploy the application

Create AWS account
Create Repository
Create Lambda funcion
Create OPENAPIKEY env var
Create Load Balancer
Execute the try.curl to send a HTTP request to the Lambda

## About Me
I'm a Senior Software Developer in pursuit of a digital nomad career, looking to help other people achieve their goals through the usage of technology

## Contact
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/gustavo-schmid-de-jesus/)
[![gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](https://mailto:gutors.nomad@gmail.com)
