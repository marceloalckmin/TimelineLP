# TimelineLP

**A music timeline organizer, visualize your albums chronologically, filter by genre and country, and build custom listening lists.**

## About
 
TimelineLP is a multiuser web application for organizing music albums into visual timelines. Built as an alternative to Spotify's limited library management it lets you sort albums chronologically, filter by genre or country, create multiple timelines (e.g. "Unheard — Rock", "Brazilian Jazz"), and link directly to Spotify for playback

---

## Architecture
 
Monolithic REST API with a layered architecture, React SPA frontend. Both WIP, backend is still underdeveloped

```
backend/
├── user/           # User management
├── timeline/       # Timeline CRUD + TimelineAlbum join entity
└── album/          # Album management
```

## Features
 
### Done
- [x] Album registration with duplicate detection
- [x] List albums with PostgreSQL persistence
- [x] Docker Compose setup with persistent volume
 
### In Progress
- [ ] User registration
- [ ] Timeline CRUD for each user only (or maybe sharing with 1+ users)
- [ ] Add/remove albums from timelines
 
### Planned
- [ ] User authentication (JWT)
- [ ] Spotify link generation
- [ ] Timeline filtering
- [ ] Custom genre override per album
- [ ] React frontend with visual timeline component (kind of the whole idea)
- [ ] Deploy (Railway + Vercel maybe, never deployed anything but these are some options) 

---
 
## Running Locally
 
**Prerequisites:** Java 21, Maven, Docker
 
```bash
# Clone the repository
git clone https://github.com/marceloalckmin/TimelineLP.git
cd TimelineLP/backend
 
# Start PostgreSQL
docker compose up -d
 
# Run the application
./mvnw spring-boot:run
```
 
The API will be available at `http://localhost:8080`.
 
**Environment:** The application connects to PostgreSQL using the credentials defined in `docker-compose.yml`. No additional configuration needed for local development.

If you want to check if the database persistance is working for you, just use the postgres docker container with:
```sh
docker exec -it timelinelp_db psql -U timelinelp -d timelinelp
```