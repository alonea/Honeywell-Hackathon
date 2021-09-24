import { ordersAPI } from '../util';
import { UPDATE_ORDERS } from './actionTypes';

export const updateFilters = orders => ({
  type: UPDATE_ORDERS,
  payload: orders
});


export const fetchOrders=()=>dispatch=>{
    return fetch(ordersAPI).then(res => res.json()).then(data=>{
        return dispatch({
            type: UPDATE_ORDERS,
            payload: data
          });
    });

}