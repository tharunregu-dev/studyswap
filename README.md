# StudySwap

Student marketplace for selling, renting, exchanging, and donating textbooks.

## Run the web app

```bash
npm install
npm run dev
```

The app starts at `http://localhost:5173`. The demo includes real interactive search, listing-type filters, wishlist state, listing form validation, and transaction request feedback.

## API foundation

```bash
cd backend
mvn spring-boot:run
```

Configure MySQL with `database/schema.sql`, then copy `.env.example` values into your environment. Swagger is available at `http://localhost:8080/swagger-ui/index.html` when the backend is running.

## Essential marketplace rules

| Type | Price | Payment | Primary action |
|---|---|---|---|
| Sell | Required | Yes | Buy now |
| Rent | Daily rate + deposit | Yes | Rent now |
| Exchange | Never displayed | No | Propose exchange |
| Donate | Never displayed | No | Request book |

The API rule service and database constraint enforce null monetary fields for both `DONATE` and `EXCHANGE` listings.
