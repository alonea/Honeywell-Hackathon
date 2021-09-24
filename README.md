# Honeywell-Hackathon

This application has two parts UI and Backend cart-ui written in React and Honeywell-Backend for backend

## Installation

Use the npm manager [npm] to install UI libraries in cart-ui.

```bash
yarn install
```

## Backend is in spring boot & java version 11

```bash
mvn install
```
## Database is no SQL mongo db create a collection in db with name "areocart" and documents "products" and insert the below json
```json
[
  {
    "_id": "614de0d1e21bec19e2c992e0",
    "availableTypes": [
      "Military",
      "Commercial"
    ],
    "currencyFormat": "$",
    "currencyId": "USD",
    "description": "4 MSL",
    "id": 12,
    "installments": 9,
    "isFreeShipping": true,
    "price": 10.9,
    "sku": 12064273040195392,
    "style": "Compatabile with all aircrafts",
    "title": "Turbine"
  },
  {
    "_id": "614de0d1e21bec19e2c992e1",
    "availableTypes": [
      "Military",
      "Commercial"
    ],
    "currencyFormat": "$",
    "currencyId": "USD",
    "description": "4 MSL",
    "id": 12,
    "installments": 9,
    "isFreeShipping": true,
    "price": 10.9,
    "sku": 12064273040195392,
    "style": "Compatabile with all aircrafts",
    "title": "Engine"
  },
  {
    "_id": "614de0d1e21bec19e2c992e2",
    "availableTypes": [
      "Military",
      "Commercial"
    ],
    "currencyFormat": "$",
    "currencyId": "USD",
    "description": "4 MSL",
    "id": 12,
    "installments": 9,
    "isFreeShipping": true,
    "price": 10.9,
    "sku": 12064273040195392,
    "style": "Compatabile with all aircrafts",
    "title": "Wing"
  }
]
``` 

## run application

run UI and backend separately using npm start for UI and start spring boot application

## License
Rajesh alonea

