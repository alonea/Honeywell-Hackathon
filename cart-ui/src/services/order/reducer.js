import { UPDATE_ORDERS } from './actionTypes';

const initialState = {
  orders: []
};

export default function(state = initialState, action) {
  switch (action.type) {
    case UPDATE_ORDERS:
      return {
        ...state,
        items: action.payload
      };
    default:
      return state;
  }
}
