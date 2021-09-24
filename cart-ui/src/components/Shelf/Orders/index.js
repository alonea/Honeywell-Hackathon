import PropTypes from 'prop-types';
import React, { Component } from 'react';
import { connect } from 'react-redux';
import { fetchOrders } from '../../../services/order/actions';
import '../Filter/style.scss';
import Spinner from '../../Spinner';

class Orders extends Component {
  static propTypes = {
    fetchOrders: PropTypes.func.isRequired,
    orders: PropTypes.array
  }
  state = {
    isLoading: false
  };
  componentDidMount() {
    this.handleFetchOrders();
  }

  handleFetchOrders = () => {
    this.setState({ isLoading: false });
    this.props.fetchOrders(() => {
      this.setState({ isLoading: false });
    });
  };

  render() {
    const { orders } = this.props;
    const { isLoading } = this.state;
    return (
      <React.Fragment>
        {isLoading && <Spinner />}
        <div className="filters">
          <h4 className="title">Your Orders:</h4>
          {orders.map(o => (
            <option value={o.value} key={o.value}>
              {o.label}
            </option>
          ))}
        </div>
      </React.Fragment>
    )
  }
}

const mapStateToProps = state => ({
  orders: state.order.orders
});

Orders.propTypes = {
  orders: PropTypes.array
};

export default connect(
  mapStateToProps,
  { fetchOrders },
)(Orders);
