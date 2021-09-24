export const formatPrice = (x, currency) => {
  switch (currency) {
    case 'BRL':
      return x.toFixed(2).replace('.', ',');
    default:
      return Number(x).toFixed(2);
  }
};

export const productsAPI ='http://localhost:8080/products/';
export const ordersAPI = 'http://localhost:8080/orders/';

