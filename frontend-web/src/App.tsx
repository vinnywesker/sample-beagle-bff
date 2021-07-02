import React from 'react'
import { BeagleProvider, BeagleRemoteView } from '@zup-it/beagle-react'
import BeagleService from './beagle/beagle-service'
import Container from './components/container'

function App() {
  return (
    <Container>
      <BeagleProvider value={BeagleService}>
        <BeagleRemoteView route={'/screen'} />
      </BeagleProvider>
    </Container>
  )
}

export default App
