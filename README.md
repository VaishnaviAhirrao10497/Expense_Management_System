
# TSERP

Back-end code for the new TS website

## Deployment

To deploy this project run the "TserpApplication.java"


```bash 
  You need to use the POST method to get the bearer token. Login using
  
  username = Admin & password = Test@123
  
  The bearer token must be used to hit all the APIs.
```


## API Reference

### Batch Announcement API

JSON payload for adding batch annuncement. 

```bash
 {
    "course_title":"Full Stack Developement",
    "start_date":"2023-01-01",
    "start_time":"7.30",
    "mode":"Hybrid",
    "trainer_name":"Vinod Borse"
}
```
`

#### Post Batch Announcement

```http
  POST /api/add_batch_announcement
```

| Parameter | Returns     | Description                |
| :-------- | :------- | :------------------------- |
| `JSON data` | `null` | adds a new batch |

#### Get Batch Announcement by id

```http
  GET /api/get_batch_announcement/{id}
```

| Parameter | Returns     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Batch Announcement` | **id is required.**  |


#### Get All Batch Announcement

```http
  GET /api/get_batch_announcements
```

| Parameter | Returns     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `null`      | `List of Batch Announcements` | # |


#### Get All Batch Announcement

```http
  GET /api/delete_batch_announcement/{id}
```

| Parameter | Returns     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `null` | **id is required.** Removes the Batch Announcement.  |


### Recent Placement/Placed Student API
JSON payload for adding placed student. 

```bash
 {
    "studentName":"Mahesh Gavhane",
    "ctc":"6800000"
}
```


#### Post a Placed Student

```http
  POST /api/add_placed_student
```

| Parameter | Returns     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `JSON data` | `Placed Student` | Adds a Placed Student.  |

#### Get a Placed Student with id

```http
  GET /api/get_placed_student/{id}
```

| Parameter | Returns     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id` | `Placed Student` | **id is required.** |


#### Get All Placed Students

```http
  GET /api/get_placed_students
```

| Parameter | Returns     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `JSON data` | `list of Placed Students` | # |
