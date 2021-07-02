import React from 'react';
import {SafeAreaView} from 'react-native';
import {BeagleProvider, BeagleRemoteView} from '@zup-it/beagle-react-native';
import {ThemeProvider, useTheme} from 'react-native-paper';

import BeagleService from './beagle/beagle-service';
import Container from './components/container';

function App() {
  const Theme = useTheme();
  return (
    <ThemeProvider
      theme={{
        ...Theme,
        colors: {
          ...Theme.colors,
          primary: '#3f51b5',
        },
      }}>
      <BeagleProvider value={BeagleService}>
        <SafeAreaView style={{height: '100%'}}>
          <Container>
            <BeagleRemoteView route={'/screen'} />
          </Container>
        </SafeAreaView>
      </BeagleProvider>
    </ThemeProvider>
  );
}

export default App;
