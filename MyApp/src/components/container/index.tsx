import React from 'react';
import {View} from 'react-native';
import {Appbar} from 'react-native-paper';

const Container = ({children}) => (
  <View style={{flex: 1}}>
    <Appbar.Header>
      <Appbar.Content title="Tecnoanjos application" subtitle="Testing" />
    </Appbar.Header>
    {children}
  </View>
);

export default Container;
