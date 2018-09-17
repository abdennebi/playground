# Read me

- Create a project. We'll assume that the projct name is $PROJECT_NAME

- Replace in ``terraform.tfvars`` the project property with $PROJECT_NAME (you may also change the zone to your favorite one)

- Initialize ``gcloud`` configuration by selecting your active account, active project and your favorite zone.

````bash
gcloud init
````

- Get your *application defaut credentials*. They will be used by terraform.

````bash
gcloud auth application-default login
````

- Run Terraform

````bash
terraform init
````

````bash
terraform plan
````

````bash
terraform apply
````
