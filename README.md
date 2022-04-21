# AWS-S3-Upload-and-download

 Here we  will be going to see how can we store the files in the Amazon S3 bucket.
Here we do like.
1. How to upload files to the S3 bucket.
2. How to download files from the S3 bucket.
3. How to delete files from S3
4. How to get the list of available files in the S3 bucket.
Herer I  implemented the solution in spring boot and will use the AWS SDK to interact with the S3 bucket.


### Add SDK in Dependency 

```
<dependency>
    <groupId>com.amazonaws</groupId>
    <artifactId>aws-java-sdk</artifactId>
    <version>1.11.163</version>
</dependency>

```


Create AWS account

Create User from IAM and assign policy AWSS3fullaccess programatically ( So this user will get the all S3 bucket access through CLI or progam not console )

download the access key and Access ID

Change the access key and access ID in application.yml file

Create Bucket from S3 service with default configuration

provide the bucket name and endpoint url of this bucket in the application.yml file
